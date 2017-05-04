package com.uca.parcial1.countrygame.data;

import com.uca.parcial1.countrygame.R;

import java.util.ArrayList;

/**
 * Created by fernando on 5/2/17.
 */

public class CountryRepo {
    public static ArrayList<Country> data;
    private static CountryRepo instance = null;

    protected CountryRepo() {
        this.data = new ArrayList<>();
        this.data.add(new Country("El Salvador", "El Salvador, es un país soberano de América " +
                "Central ubicado en el litoral del océano Pacífico con una extensión " +
                "territorial de 21 041 km². En el año 2015 contaba con una población " +
                "estimada en 6 521 0006 habitantes, siendo el país más densamente poblado " +
                "del continente americano. Su clima es cálido tropical. El Salvador limita " +
                "con Guatemala al oeste y con Honduras al norte y al este, al sureste el golfo de " +
                "Fonseca lo separa de Nicaragua, y flanqueado al sur por el océano Pacífico.", R.drawable.sv, "Español", 21041, "San Salvador"));
        this.data.add(new Country("Mexico", "Mexico, cuyo nombre oficial es Estados Unidos Mexicanos, es un país de " +
                "América, ubicado en la parte meridional de América del Norte. Su capital es la Ciudad " +
                "de México.Políticamente es una repúblicademocrática, representativa y federal compuesta " +
                "por 32 entidades federativas.", R.drawable.mx, "Español", 1964375, "Mexico"));
        this.data.add(new Country("USA", "Estados Unidos, oficialmente Estados Unidos de América  es un país " +
                "soberano constituido en república federalconstitucional compuesta por 50 estados y " +
                "un distrito federal. La mayor parte del país se ubica en el centro de América del Norte " +
                "—donde se encuentran sus 48 estados contiguos y Washington D. C., el distrito de la capital—, " +
                "entre los océanos Pacífico y el Atlántico, limita con Canadá al norte y con México al sur. " +
                "El estado de Alaska está en el noroeste del continente, limitando con Canadá al este y " +
                "separado de Rusia al oeste por el estrecho de Bering.", R.drawable.us, "Ingles", 9833517, "Washinton D.C"));
        this.data.add(new Country("Reino Unido", "El Reino Unido denominado oficialmente Reino Unido de Gran " +
                "Bretaña e Irlanda del Norte  es un país soberano e insular, miembro de la Unión " +
                "Europea, ubicado al noroeste de la Europa Continental. Su territorio está formado " +
                "geográficamente por la isla de Gran Bretaña, el noreste de la isla de Irlanda y " +
                "pequeñas islas adyacentes. Irlanda del Norte es la única parte del país con una " +
                "frontera terrestre, la que la separa de la República de Irlanda. ", R.drawable.uk, "Ingles", 243610, "Londres"));
        this.data.add(new Country("Canada", "Canada es un país soberano de América del Norte, " +
                "cuya forma de gobierno es la monarquía parlamentaria federal. Su territorio está " +
                "organizado en diez provincias y tres territorios. Su capital es la ciudad de Ottawa " +
                "y la ciudad más poblada es Toronto.", R.drawable.ca, "Ingles", 9984670, "Ottawa"));
        this.data.add(new Country("Rusia", "Rusia, es el país más extenso del mundo. La Federación de Rusia cuenta con una superficie de " +
                "17 098 242 kilómetros cuadrados,equivalente a la novena parte de la tierra firme del planeta, y " +
                "con gran variedad de relieves y entornos naturales. Su capital es la ciudad federal de Moscú.", R.drawable.ru, "Ruso", 17098242, "Moscú"));
        this.data.add(new Country("Alemania", "Alemania es un país soberano centroeuropeo y miembro de la Unión Europea; se organiza " +
                "como una república parlamentaria federal y su capital es Berlín. Su territorio, formado por dieciséis estados federados " +
                "(Bundesländer), limita al norte con el mar del Norte, Dinamarca y el mar Báltico; al estecon Polonia y la República Checa; " +
                "al sur con Austria y Suiza, y al oeste con Francia, Luxemburgo, Bélgica y los Países Bajos. " +
                "La ciudad de Büsingen, enclavada en Suiza, también forma parte de Alemania.", R.drawable.de, "Aleman", 357022, "Berlin"));
        this.data.add(new Country("Japón","Japón,  oficialmente Estado de Japón , es un país soberano insular del este de Asia. " +
                "Situado en el océano Pacífico; tiene al oeste el mar del Japón, China, Corea del Norte, Corea del Sur y Rusia, " +
                "al norte el mar de Ojotsk y al sur el mar de China Oriental y Taiwán. Los caracteres que componen el nombre de Japón " +
                "significan «el origen del sol», motivo por el que el país también es conocido como la Tierra del Sol Naciente.", R.drawable.jp, "Japones", 377915, "Tokyo"));
        this.data.add(new Country("Corea del Sur","La República de Corea, comúnmente conocida como Corea del Sur para distinguirla " +
                "de Corea del Norte, es un país de Asia Oriental, ubicado en la parte sur de la península de Corea. Limita al norte " +
                "con la República Popular Democrática de Corea (RPDC o Corea del Norte), con la cual formó un solo país hasta 1945. " +
                "Al este se encuentra el mar de Corea o el mar del Este, al sur el estrecho de Corea, que lo separa de Japón, y al oeste " +
                "el mar Amarillo. ", R.drawable.kr, "Coreano", 99720, "Seul"));
        this.data.add(new Country("Francía","Francia, oficialmente República Francesa, es un país soberano, miembro de la Unión " +
                "Europea, constituido en Estado social y democrático de derecho y cuya forma de gobierno es la república semipresidencialista" +
                ". Su territorio, que incluye regiones de ultramar, se extiende sobre una superficie total de 643 801 km².En 2015 el país " +
                "contaba con 66,3 millones de habitantes, 64,2 en la Francia metropolitana y 2,1 en los territorios de ultramar.", R.drawable.fr, "Francés", 643801, "París"));
        this.data.add(new Country("Portugal","Portugal, oficialmente la República Portuguesa , es un país soberano miembro de la " +
                "Unión Europea, constituido como un estado de derecho democrático. Es un país transcontinental, su territorio, " +
                "con capital en Lisboa, está situado en el suroeste de Europa, en la península ibérica. Limita al este y al norte con " +
                "España, y al sur y oeste con el océano Atlántico. Comprende también los archipiélagos autónomos de las Azores y Madeira " +
                "situados en el hemisferio norte del océano Atlántico.", R.drawable.pt, "Portugues", 92090, "Lisboa"));
        this.data.add(new Country("Indía","La India oficialmente República de la India  es un país ubicado en el sur de " +
                "Asia. Con sus más de 1240 millones de habitantes, es el segundo país del mundo por población después de " +
                "la República Popular China (con 1370 millones) y la democracia más populosa del mundo. Su superficie es de " +
                "3 287 263 km²,3 lo cual lo ubica en el séptimo lugar entre los países más extensos del planeta. Limita con " +
                "el océano Índico al sur, con el mar Arábigo al oeste y con el golfo de Bengala al este, a lo largo de una " +
                "línea costera de más de 7517 kilómetros.", R.drawable.in, "Hindú", 3287263, "Nueva Dehli"));
        this.data.add(new Country("Argentina","La República Argentina, conocida simplemente como Argentina,es un país " +
                "soberano de América del Sur, ubicado en el extremo sur y sudeste de dicho subcontinente. Adopta la forma " +
                "de gobierno republicana, representativay federal. El Estado argentino es un Estado federal descentralizado, " +
                "integrado por un Estado nacional y veintitrés estados provinciales autónomos que constituyen la federación, " +
                "que jurídicamente son preexistentes y que se reservan todos los poderes no delegados.", R.drawable.ar, "Español", 2780400, "Buenos Aires"));
        this.data.add(new Country("Chile","Chile se describe constituido por tres zonas geográficas. La primera de ellas, Chile " +
                "continental, comprende una franja en la costa occidental del Cono Sur que se extiende entre los paralelos 17°" +
                "29'57\" S y 56°32'12\" S, mayormente desde la ribera sudoriental del océano Pacífico hasta las cumbres más altas " +
                "de la cordillera de los Andes. Alcanza un largo de 4270 km, un ancho máximo de 445 km en los 52°21' S, en la Región " +
                "de Magallanes y Antártica Chilena, y un ancho mínimo de 90 km en los 31°37' S, en la Región de Coquimbo", R.drawable.cl, "Español", 756102.4, "Santiago"));
        this.data.add(new Country("Colombia","Colombia, oficialmente República de Colombia, es un país soberano situado en la región noroccidental de " +
                "América del Sur. Está constituido en un estado unitario, social y democrático de derecho cuya forma de gobierno es presidencialista. Esta " +
                "república está organizada políticamente en 32 departamentos descentralizados y el Distrito capital de Bogotá, sede del " +
                "gobierno nacional.", R.drawable.co, "Español", 357022, "Bolivia"));
        this.data.add(new Country("España","España, también denominado Reino de España, es un país soberano, miembro de la Unión Europea, " +
                "constituido en Estado social y democrático de derecho y cuya forma de gobierno es la monarquía parlamentaria. Su territorio, " +
                "con capital en Madrid, está organizado en diecisiete comunidades autónomas y dos ciudades autónomas, formadas estas, a su vez, " +
                "por cincuenta provincias.", R.drawable.es, "Español", 505370, "Madrid"));
        this.data.add(new Country("Suecia","Suecia, oficialmente Reino de Suecia, es un país escandinavo de Europa del Norte que forma parte de " +
                "la Unión Europea (UE). Limita al norte con Noruega y Finlandia, al este con Finlandia y el golfo de Botnia, al sur con el mar Báltico " +
                "y al oeste con el mar del Norte y Noruega. Tiene fronteras terrestres con Noruega y Finlandia, y está conectado a Dinamarca por el " +
                "puente de Öresund. Su ciudad más poblada es Estocolmo, que es también su capital.", R.drawable.se, "Sueco", 450295, "Stockholm"));
        this.data.add(new Country("Finlandia","Finlandia, oficialmente República de Finlandia, es un país miembro de la Unión Europea desde 1995 " +
                "y situado en el noreste de Europa. Tiene fronteras al oeste con Suecia, al este con Rusia y al norte con Noruega. Por el oeste y " +
                "el sur está rodeada por el mar Báltico, que la separa de Suecia y Estonia, cruzando los golfos de Botnia y Finlandia, respectivamente. " +
                "La capital y ciudad más importante del país es Helsinki.", R.drawable.fi, "Finlandes", 338145, "Helsinsky"));
        this.data.add(new Country("China","La República Popular China, o simplemente China, es un Estado soberano situado en " +
                "Asia Oriental. Es el país más poblado del mundo, con más de 1300 millones de habitantes, y la primera potencia económica mundial " +
                "por PIB, en términos de paridad de poder adquisitivo. La República Popular China es un Estado unipartidista gobernado por el Partido " +
                "Comunista y tiene la sede de su gobierno en la capital, Pekín. Está dividida en veintidós provincias, cinco regiones autónomas, cuatro " +
                "municipios bajo jurisdicción central —Pekín, Tianjin, Shanghái y Chongqing— y dos regiones administrativas especiales —Hong Kong y Macao—. " +
                "Asimismo, China reclama la que considera provincia de Taiwán, que es controlada por la República de China con un estatus político " +
                "de la isla controvertido.", R.drawable.cn, "Chino", 9596960, "Beijing"));
        this.data.add(new Country("Panamá","Panamá es un país ubicado en el sureste de América Central. Su nombre oficial es " +
                "República de Panamá y su capital es la ciudad de Panamá.Limita al Norte con el mar Caribe, al Sur con el océano " +
                "Pacífico, al Este con Colombia y al Oeste con Costa Rica. Tiene una extensión de 75 420 km². Localizado en el istmo " +
                "de Panamá istmo que une a América del Sur con América Central, su territorio montañoso solamente es interrumpido por el canal de Panamá. " +
                "Su población es de 4 002 360. El 1º de enero de 2014 se crea la provincia de Panamá Oeste, así estando constituida " +
                "por 10 provincias y por cinco comarcas indígenas. Antes del 31 de diciembre de 2013 estaba " +
                "constituida por nueve provincias", R.drawable.pa, "Español", 357022, "Panamá"));
    }

    public static CountryRepo getInstance() {
        if(instance == null)
            instance = new CountryRepo();
        return instance;
    }
}
