let num = 0;
let invervalosegundos= 1000;

function adelante(){
   num++;
    if(num>5){
       return num=1;}
       else {
        let foto = document.getElementById("foto");
        foto.src = "./Imagenes/Imagenes del carrousel/img"+num+".jpg";}
    
}

function atras(){
    num--;
    if(num<1){
    return num=5;}
    else{    
    let foto = document.getElementById("foto");
    foto.src = "./Imagenes/Imagenes del carrousel/img" +num+ ".jpg";}  
    }


window.onload = function reproduccionAutomatica(){
     
    adelante_automatico=setInterval(adelante, invervalosegundos);}

function desactivarreproduccionAutomatica(){
    clearInterval(adelante_automatico);
    
}
document.getElementById("animacionacercade").animate([
    
    { transform: 'translateY(-600px)' },
    { transform: 'translateY(0px)' }
  ], {
    
    duration: 4000,
    
  });

  function animacion_footer(){
        document.getElementById("pie de pagina").animate([
        { transform: "rotate3d(1, 0, 0, 360deg"}],{ 
    duration: 2000
    
  });
       
}