"use strict";
exports.__esModule = true;
exports.Alas = void 0;
var Alas = /** @class */ (function () {
    function Alas(cantidad) {
        this.numAlas = 0;
        this.numAlas = cantidad;
    }
    Alas.prototype.toString = function () {
        return " Alas: " + this.numAlas + " ala/s ";
    };
    return Alas;
}());
exports.Alas = Alas;
