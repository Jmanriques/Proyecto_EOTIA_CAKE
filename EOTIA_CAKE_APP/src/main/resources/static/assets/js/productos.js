$(document).ready(function() {

    cargarProductos();

});

async function cargarProductos() {

    
    const request = await fetch('api/producto', {
    method: 'GET',
    });
    const productos = await request.json();

    console.log(productos);

    let listadoHtml = '';

    for (let index = 0; index < productos.length; index++) {


        let usuarioHtml = `
        <div class="col-lg-6 menu-item ${productos[index].categoria}">
            <img src="${productos[index].img}" class="menu-img" alt="${productos[index].categoria}">
            <div class="menu-content">
              <a href="#">${productos[index].nombre}</a><span>$${productos[index].precioUnitario}</span>
            </div>
            <div class="menu-ingredients">
                ${productos[index].descripcion}
            </div>
        </div>
        `;
        listadoHtml += usuarioHtml;

    }

    
    
    document.querySelector('#productos').outerHTML = listadoHtml;
}