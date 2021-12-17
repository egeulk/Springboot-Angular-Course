export class Product {
    sku: string= '' ;
    name : string='';
    description : string='';
    unitPrice : number=0;
    imageUrl : string='Product';
    active: boolean=true;
    unitsInStock : number= 0;
    dateCreated: Date = new Date();
    lastUpdated:Date = new Date();
}
