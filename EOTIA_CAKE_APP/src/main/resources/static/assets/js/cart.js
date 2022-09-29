$(document).ready(function() {
    cargarProductos();
});
let ShoppingCart = document.getElementById("productos");
let label = document.getElementById("label");
let basket = JSON.parse(localStorage.getItem("data")) || [];

let cargarProductos = async() => {
    if (basket.length !== 0) {

        const request = await fetch('api/producto', {
        method: 'GET',
        });

        const productos = await request.json();

            let listadoHtml = basket
            .map((x) => {
                let { id, item } = x;

                let search = productos.find((x) => x.id === id) || [];
                let {categoria, img, nombre, precioUnitario, descripcion} = search;
                return `
                <div class="col-lg-6 menu-item ${categoria}">
                    <img src="${img}" class="menu-img" alt="${categoria}">
                    <div class="menu-content">
                        <a>${nombre}</a><span>$${precioUnitario}</span>
                    </div>
                    <div class="menu-ingredients">
                        <div id=${id} class="quantity">Cantidad: ${item}</div>
                        <div class="d-grid gap-2 d-md-flex justify-content-md-end">

                            <button type="button" id="boton" class="btn" onclick="addItem(${id})"><i class="bi bi-plus-square"></i></button>
                            <button type="button" id="boton" class="btn" onclick="decrementItem(${id})"><i class="bi bi-dash-square"></i></button>
                        </div>
                    </div>
                </div>
                `;
            })

            document.querySelector('#productos').outerHTML = listadoHtml;
            // ShoppingCart.innerHTML = listadoHtml;


    }
    else {
        label.innerHTML = `
        <div>
            <h4>Mi Carrito esta vacio</h4>
            <a href="index.html">
            <button type="button" id="boton" class="btn">Volver</button>
            </a>
        </div>
        `;
    }
}




let TotalProducts = () => {
    let cartIcon = document.getElementById("cartAmount");
    const totalProducts = (basket.map((x) => x.item).reduce((x, y) => x + y, 0));
    cartIcon.innerHTML = `
    
    <h2><i class="bi bi-cart3"></i> Mi Carrito </h2>
    <p>Tus productos: ${totalProducts}</p>
    `;
};

TotalProducts();



let addItem = (id) => {
    let selectedItem = id
    let search = basket.find((x) => x.id === selectedItem);

    if (search === undefined) {
      basket.push({
        id: selectedItem,
        item: 1,
      });
    } else {
      search.item += 1;
    }
    location.reload()
    update(selectedItem.id);
    localStorage.setItem("data", JSON.stringify(basket));
};

let decrementItem = (id) => {
    let selectedItem = id;
    let search = basket.find((x) => x.id === selectedItem);



    if (search === undefined) return;
    else if (search.item === 0) return;
    else {
      search.item -= 1;
    }
    location.reload()
    update(selectedItem.id);
    basket = basket.filter((x) => x.item !== 0);
    localStorage.setItem("data", JSON.stringify(basket));
  };

let update = (id) => {
    TotalProducts();
};


let TotalAmount = async() => {

    const request = await fetch('api/producto', {
        method: 'GET',
        });

    const productos = await request.json();
    console.log(productos);
    if (basket.length !== 0) {
      let amount = basket
        .map((x) => {
          let { id, item } = x;
          let filterData = productos.find((x) => x.id === id);
          return filterData.precioUnitario * item;
        })
        .reduce((x, y) => x + y, 0);
  
      return (label.innerHTML = `
      <h4>Total Factura : $ ${amount}</h4>
      `);
    } else return;
  };
  
  TotalAmount();

  let clearCart = () => {
    basket = [];
    localStorage.setItem("data", JSON.stringify(basket));
    location.reload()
  };
  
  