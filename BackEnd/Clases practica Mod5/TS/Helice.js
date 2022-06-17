"use strict";
exports.__esModule = true;
exports.Helice = void 0;
var Helice = /** @class */ (function () {
    function Helice(cantidad) {
        this.numHelices = 0;
        this.numHelices = cantidad;
    }
    Helice.prototype.toString = function () {
        return " Helices: " + this.numHelices + " helice/s ";
    };
    return Helice;
}());
exports.Helice = Helice;
