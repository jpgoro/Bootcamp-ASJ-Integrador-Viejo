export interface Orden {
  id: number;
  numeroOrden: number;
  fechaEmision: string;
  fechaEntrega: string;
  direccion: string;
  proveedor_razon: string;
  proveedor_id: number;
  nombreProducto:string;
  productoId: number;
  cantidad:string;
  total:number;
}
