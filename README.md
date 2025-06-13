# Requerimientos del Proyecto - Plataforma de Venta de Contenido Digital

## 🌐 Necesidad Principal del Negocio

Crear una aplicación que permita:
- Controlar y administrar el contenido digital almacenado (música, películas, series).
- Vender pistas de audio, álbumes, soundtracks, películas y series digitalmente.
- Generar enlaces temporales de descarga tras la compra.
- Proveer una experiencia de compra completa con vista previa, carrito y pago por transferencia o depósito.

---

## ✅ Requerimientos Funcionales

### Música
- Vender pistas individuales y álbumes completos.
- Solo se permite música oficial vinculada a sellos discográficos (no artistas independientes sin respaldo).
- Se aceptan versiones alternativas: lados B, remixes, en vivo, aniversarios, etc.
- Posibilidad de hacer previews de las pistas antes de agregarlas al carrito.
- Capacidad para seleccionar múltiples pistas de diferentes álbumes o colecciones.

### Películas y Series
- Venta únicamente, sin renta ni membresías.
- Se permite descargar la película completa en formato MP4.
- Se puede vender el soundtrack como producto separado.
- Las series se descargan por temporadas, cada una con varios capítulos.

### Descargas
- El usuario recibe un enlace de descarga vía correo electrónico.
- Enlace disponible solo por 24 horas.
- Si no se descarga a tiempo, se puede extender 12 horas más con un cargo del 10% del precio de venta.
- Control interno de si el archivo fue descargado o no.

### Carrito de Compras
- El usuario puede agregar múltiples productos al carrito (pistas, series, películas).
- El sistema debe permitir comprar varios artículos en una sola transacción.

### Pagos
- Únicamente por depósito bancario o transferencia.
- Se debe enviar comprobante de pago.
- Solo se genera el link de descarga tras la verificación del pago.

### Ofertas y Estadísticas
- Posibilidad de aplicar ofertas temporales a pistas, series o películas.
- Estadísticas de ventas para identificar los productos más vendidos.

---

## 🗃️ Necesidades de Datos

### Para el Contenido
- Música:
  - Título de la pista.
  - Álbum/colección.
  - Artista.
  - Sello discográfico.
  - Formato (MP3, FLAC).
  - Edición (aniversario, en vivo, remaster, etc.).

- Películas y Series:
  - Título.
  - Género.
  - Año de estreno.
  - Formato (MP4).
  - Soundtrack asociado (si existe).

### Para el Usuario/Cliente
- Nombre completo.
- Correo electrónico (para envío del enlace).
- Comprobante de pago (imagen o PDF).
- Historial de compras.

### Para la Gestión de Enlaces
- ID de compra.
- Enlace generado.
- Fecha/hora de generación.
- Estado de descarga (sí/no).
- Expiración del enlace.
- Penalización (si aplica).

---

## 📌 Anotaciones Importantes sobre el Modelo de Negocio

- **Todo es digital**, no se manejan productos físicos.
- No se permite música de bandas sin respaldo discográfico.
- El repositorio principal de almacenamiento es **MEGA**, aunque pueden usarse otros.
- El sistema no genera enlaces predefinidos: el link se crea tras verificar el pago.
- El acceso al repositorio lo tiene únicamente el administrador.
- No se maneja streaming, solo descarga de archivos.
- No hay membresías ni cuentas con acceso continuo, todo es venta directa.
- Las ofertas son definidas manualmente y de forma temporal por el administrador.
- El mínimo de canciones a manejar en el sistema es **100 pistas**.

---

## 📅 Entregables y Tiempos

- Para la siguiente clase (miércoles próximo), se realizará una **reunión de seguimiento** para dudas adicionales.
- En dos semanas iniciarán las **revisiones de avances** del proyecto.
