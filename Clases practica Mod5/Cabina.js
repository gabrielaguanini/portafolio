"use strict";
exports.__esModule = true;
exports.Cabina = void 0;
var Cabina = /** @class */ (function () {
    function Cabina(otraCabinaTripulacion, otraCabinavuelo, otraSistemaEmergencia, otraTanquesCombustible, otraPuertasSalida) {
        this.cabinaTripulacion = false;
        this.cabinaVuelo = false;
        this.sistemaEmergencia = false;
        this.numTanquesCombustible = 0;
        this.numPuertasSalida = 0;
        this.cabinaTripulacion = otraCabinaTripulacion;
        this.cabinaVuelo = otraCabinavuelo;
        this.sistemaEmergencia = otraSistemaEmergencia;
        this.numTanquesCombustible = otraTanquesCombustible;
        this.numPuertasSalida = otraPuertasSalida;
    }
    Cabina.prototype.toString = function () {
        var mensaje = " Cabina compuesta de: ";
        if (this.cabinaVuelo) {
            mensaje += " Cubierta de vuelo ";
        }
        if (this.cabinaTripulacion) {
            mensaje += " Cubierta de tripulacion, ";
        }
        if (this.sistemaEmergencia) {
            mensaje += " Sistema de Emergencia, ";
        }
        mensaje += this.numTanquesCombustible + " Tanque/s de combustible, ";
        mensaje += this.numPuertasSalida + " Puerta/s de salida ";
        return mensaje;
    };
    return Cabina;
}());
exports.Cabina = Cabina;
