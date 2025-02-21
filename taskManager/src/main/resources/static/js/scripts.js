function cargarContenido(event, url) {
    event.preventDefault(); // Evitar recarga de página
	fetch(url)
	    .then(response => response.text())
		.then(html => {
		    document.getElementById("contenidoPrincipal").innerHTML = html;  // Insertar en el contenedor
		})
	    .catch(error => console.error("Error al cargar:", error));
}


