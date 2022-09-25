$(document).ready(function() {
    cargarProductos();
    
});

let basket = JSON.parse(localStorage.getItem("data")) || [];

async function cargarProductos() {

    
    const request = await fetch('api/producto', {
    method: 'GET',
    });
    const productos = await request.json();

    

    let listadoHtml = '';

    for (let index = 0; index < productos.length; index++) {

        const producto = productos[index];
        console.log(producto)

        let usuarioHtml = `
        <div class="col-lg-6 menu-item ${productos[index].categoria}">
            <img src="${productos[index].img}" class="menu-img" alt="${productos[index].categoria}">
            <div class="menu-content">
              <a>${productos[index].nombre}</a><span>$${productos[index].precioUnitario}</span>
              
            </div>
            <div class="menu-ingredients">
                ${productos[index].descripcion}
                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                    <button type="button" id="boton" class="btn" onclick="addCart(${productos[index].id})">Add to Cart</button>
                </div>
            </div>
        </div>
        `;

        
        listadoHtml += usuarioHtml;

    }    
    document.querySelector('#productos').outerHTML = listadoHtml;
}

let addCart = (id) => {
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
  
    console.log(basket);
    localStorage.setItem("data", JSON.stringify(basket));
};