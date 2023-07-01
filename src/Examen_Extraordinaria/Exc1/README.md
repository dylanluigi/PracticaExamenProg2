Suposem que tens una classe anomenada Matriu en Java, que inclou els mètodes i atributs vists a classe. Utilitza la classe Matriu per resoldre el següent problema:

Donat un número enter <i>n</i>, crea una matriu quadrada de mida <i>n x n</i> i sol·licita a lúsuari que ingressi els valors dels elements de la matriu. A continuació, implementa un mètode anomenat <i>calcularDeterminant()</i> a la classe Matriu que calculi el determinant de la matriu ingressada.
El mètode ha d'utilitzar un enfocament iteratiu per al càlcul del determinant, utilitzant el mètode de cofactos. A més, implementa un mètode auxiliar anomenat <i>obtenirSubmatriu(filaEliminar, columnaEliminar)</i> que retorni una submatriu de la matriu original eliminant una fila i una columna específiques. Finalment, mostra el valor del determinant per pantalla.

Tingues en compte les següents especificacions per al mètode <i>calcularDeterminant()</i>:
<ul>
  <li>El mètode ha de verificar que la matriu sigui quadrada. Si la matriu no és quadrada, llança una excepció del tipus <i>UnsupportedOperationException</i> amb el missatge "La matriu ha de ser quadrada per calcular el determinant".</li>

  <li>El mètode ha de gestionar correctament els casos base: matrius de <i>1x1</i> i <i>2x2</i>, utilitzant les formules corresponents per al calcul del determinant en cada cas.  </li>

  <li>Per a matrius de <i>1x1</i>, el determinant es igual al valor de l'unic element de la matriu.</li>
  <li>Per a matrius <i>2x2</i>, el determinant es calcula utilitzant la fórmula: <i>ad-bc</i></li>
  <li>Per a matrius de mida superior a <i>2x2</i>, el mètode ha de calcular el determinant utilitzant un efocament iteratiu basat en el mètode de cofactors.</li>
  <li>El mètode de cofactors sáplica expandint la matriu al llarg dúna fila o columna específica. En cada pas, es calcula el cofactor dún element de la primera fila o columna, multiplicant-lo per determinant de la submatriu obtinguda en eliminar la fila i columna corresponents. El determinant final s'obté sumant i restant els productes dels corresponents. El determinant final s'obté sumant i restant els productes dels cofactors i els determinants de les submatrius.</li>
  <li>El mètode de cofactors permet calcular determinants de matrius de qualsevol dimensió. Per a la pregunta de léxamen també es considerarà correcte si sáplica a matrius de com a màxim <i>3x3</i>.</li>
</ul>

