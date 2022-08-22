# lab08groupEDA
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Grafos</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>08</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>21-Ago-2022</td><td colspan="2">HORA DE PRESENTACIÓN:</td><td>11:55</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Blanco Trujillo, Antony Jacob</li>
        <li>Checalla Soto, Edisson Franklin</li>
        <li>Vilca Suelo, Gionvanni Gabriel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</tdbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">SOLUCIÓN Y RESULTADOS</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
                <ol>
                    <li>Colocar ejercicios</li>
					<li></li>
					<li></li>
					<li>
						Solucionar el siguiente ejercicio: (5 puntos)<br>
						El grafo de palabras se define de la siguiente manera: cada vértice es una palabra
						en el idioma Inglés y dos palabras son adyacentes si difieren exactamente en una
						posición. Por ejemplo, las **cords** y los **corps** son adyacentes, mientras que los
						**corps** y **crops** no lo son.
						<p>a) Dibuje el grafo definido por las siguientes palabras: words cords corps coops
crops drops drips grips gripe grape graph</p> 
						<p>Segun el enunciado, se definen los siguientes requisitos para que 2 vértices sean adyacentes:</p>
						<ul>
							<li>Misma cantidad de letras</li>
							<li>Mismas letras en la misma posición, menos una de las letras</li>
						</ul>
						<p>Se definen los casos para que no exista adyacencia:</p>
						<ul>
							<li>Mismas letras pero al menos dos intercambiaron posición</li>
						</ul>
                        <p>A continuación se muestra el procedimiento visual para construir el grafo:</p>
                        <ul>
                            <li>
                                <p>Se inserta el nodo "words" al grafo vacío, al no existir otros nodos entonces no se compara</p>
                                <img src="./imagenesEj4/graph01.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "cords", el grafo posee un unico nodo, entonces se comparan los nodos para verificar si pueden ser adyacentes, como solo difieren de la letra en la posicion 0 entonces son adyacentes</p>
                                <img src="./imagenesEj4/graph02.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "corps", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "cords" es adyacente a "corps"</p>
                                <img src="./imagenesEj4/graph03.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "coops", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "corps" es adyacente a "coops"</p>
                                <img src="./imagenesEj4/graph04.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "crops", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "coops" es adyacente a "crops"</p>
                                <img src="./imagenesEj4/graph05.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "drops", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "crops" es adyacente a "drops"</p>
                                <img src="./imagenesEj4/graph06.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "drips", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "drops" es adyacente a "drips"</p>
                                <img src="./imagenesEj4/graph07.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "grips", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "drips" es adyacente a "grips"</p>
                                <img src="./imagenesEj4/graph08.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "gripe", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "grips" es adyacente a "gripe"</p>
                                <img src="./imagenesEj4/graph09.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "grape", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "gripe" es adyacente a "grape"</p>
                                <img src="./imagenesEj4/graph10.png">
                            </li>
                            <li>
                                <p>Se inserta el nodo "graph", se comparan los nodos existentes con el nodo a insertar y tenemos que solo "grape" es adyacente a "graph"</p>
                                <img src="./imagenesEj4/graph11.png">
                            </li>
                        </ul>
						<p>b) Mostrar la lista de adyacencia del grafo.</p>
                        <pre>
"words" -> ["cords"]
"cords" -> ["words", "corps"]
"corps" -> ["cords", "coops"]
"coops" -> ["corps", "crops"]
"crops" -> ["coops", "drops"]
"drops" -> ["crops", "drips"]
"drips" -> ["drops", "grips"]
"grips" -> ["drips", "gripe"]
"gripe" -> ["grips", "grape"]
"grape" -> ["gripe", "graph"]
"graph" -> ["grape"]
                        </pre>
					</li>
                </ol>
            </td>
        </tr>
        <tr>
            <td>
            II. SOLUCIÓN DEL CUESTIONARIO<br>
                <ul>
                    <li>Colocar preguntas y respuestas</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>
            III. CONCLUSIONES<br>
                <ul>
                    <li>Colocar conclusiones</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">RETROALIMENTACIÓN GENERAL</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
            </td>
        </tr>
    </tbody>
</table>

<table>
    <theader>
        <tr>
            <th style="text-align:center">REFERENCIAS Y BIBLIOGRAFÍA</th>
        </tr>
    </theader>
    <tbody>
        <tr>
            <td>
                <ul>
                    <li>Lista</li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>
