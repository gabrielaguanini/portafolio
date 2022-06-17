import { Aeroplano } from "./Aeroplano";
import { Helice } from "./Helice";
import { Alas} from "./Alas";
import { Cabina } from "./Cabina";
import { Turbina } from "./Turbina";

let h=new Helice(2);
let a=new Alas(2);
let c=new Cabina(true,false,true,5,3);
let t=new Turbina(2);
let aeroplano=new Aeroplano(h,a,c,t);

console.log(aeroplano.toString())