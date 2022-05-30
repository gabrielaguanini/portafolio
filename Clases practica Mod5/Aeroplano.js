"use strict";
exports.__esModule = true;
exports.Aeroplano = void 0;
var Aeroplano = /** @class */ (function () {
    function Aeroplano(nuevahelice, nuevaalas, nuevacabina, nuevaturbina) {
        this.helice = nuevahelice;
        this.alas = nuevaalas;
        this.cabina = nuevacabina;
        this.turbina = nuevaturbina;
    }
    Aeroplano.prototype.toString = function () {
        var mensaje = "Aeroplano compuesto por: ";
        mensaje += this.helice.toString();
        mensaje += this.turbina.toString();
        mensaje += this.alas.toString();
        mensaje += this.cabina.toString();
        return mensaje;
    };
    return Aeroplano;
}());
exports.Aeroplano = Aeroplano;
