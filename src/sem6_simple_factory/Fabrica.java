package sem6_simple_factory;

import sem6_simple_factory_clase_transport.*;

import static sem6_simple_factory_clase_transport.TipTransport.Autobuz;

public class Fabrica {

    public MijlocTransport returneazaMijlocTransport(TipTransport tipTransport, String nrInmatriculare) {
        switch (tipTransport) {
            case Autobuz: {
                return new Autobuz(nrInmatriculare);
            }
            case Tramvai: {
                return new Tramvai(nrInmatriculare);
            }
            case Troleibuz: {
                return new Troleibuz(nrInmatriculare);
            }
            default: {
                return null;
            }
        }
    }

}
