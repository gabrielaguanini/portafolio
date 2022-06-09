"use strict";
exports.__esModule = true;
exports.Turbina = void 0;
var Turbina = /** @class */ (function () {
    function Turbina(cantidad) {
        this.numTurbina = 0;
        this.numTurbina = cantidad;
    }
    Turbina.prototype.toString = function () {
        return " Turbinas: " + this.numTurbina + " Turbina/s ";
    };
    return Turbina;
}());
exports.Turbina = Turbina;
