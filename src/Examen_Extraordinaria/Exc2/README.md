Problema de fitxers:
Donades les següent classes:
<ol>
 <li>Estudiant: tot objecte Estudiant està representat pels segûents atributs:</li>
    <ul>
     <li>NIF: Document d'identificació.</li>
     <li>NOM.</li>
     <li>CURS.</li>
    </ul>
 <li>Assignatura: tot objecte Assignatura està representat pels següents atributs.</li>   
    <ul>
     <li>CODI: codi assignatura.</li>
     <li>NOM: nom de l'assignatura</li>
     <li>CURS.</li>
     <li>ESTUDIANTS: Emmagatzema els nif de tots els estudiants que cursen l'assignatura.</li>
     <li>NOTES: Emmagatzema les notes de tots els estudiants que cursen l'assignatura. Les notes estan en correspondencia amb els nif dels estudiants.</li>  
    <li>nEstudiants: nombre d'estudiants que cursen l'assignatura.</li>  
</ul>
</ol>

Es demana:
<ol>
<li>Realitza la implementació de les mateixes per tal de poder dur a terme tot el sol·lictat per aquest problema</li>
<li>Implementa un programa que, donat pel teclat, el nif d'un estudiant visualitzi a la pantalla tota la informació corresponent a les assignatures cursades per aquest estudiant. Per fer'ho s'utilitzaran dos fitxers: <i>estudiantes.dat</i> dóbjectes Estudiant i <i>asignaturas.dat</i> d'objectes Assignatura.</li>
</ol>

Indicacions:
S'enten que un estudiant donat no necessariament ha de cursar totes les assignatures del seu curs.
Utilitza la tecnica del sentinella per a la gestio de final de fitxer.
Implementa totes les classes necessaries.

El format de visualització serà:
<p></p>
<i>NOM: nom_estudiant - NIF: nif_estudiant - curs:xx</i>
<p></p>
<i>CODI: codiAssignatura1 - NOM: nomAssignatura1 CURS: xx NOTA: notaAssignatura1</i>
<p>...............</p>
<i>CODI: codiAssignaturaN - NOM: nomAssignaturaN CURS: xx NOTA: notaAssignaturaN</i>