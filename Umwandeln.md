
### Konvertieren von "verwandten" Zahlensystemen 
>[!faq]
> ##### Was bedeutet Verwand ?
> Verwand bedeutet in unserem Kontext, dass du die Basis des Zielsystems aus dem ursprungssytem darstellen kannst, siehe beispiele ⬇
> - $2$ und $4$ sind verwand weil $2^{2}= 4$
> - $5$ und $25$ sind verwandt, weil $5^{2}= 25$
> - $2$ und $16$ sind verwandt weil $2^{4} = 16$
> - $2$ und $9$ sind nicht verwand, weil es kein $s^{x} = 9, x \in \mathbb{N}$ gibt.   

>[!tip]
>$110_{2}$ bedeutet das die $110$ im binärsystem ist, nicht dass der wert $110_10$ also hundert zehn ist.    
> Was unten steht ist die Basis der Zahl.    
>Kurz gesagt $$a_{b}$$ $\text{für} \: a = \: \text{zahl} \: \text{und} \: b \: \text{basis}$    

Aufgabe: Konvertiere $A12_{16}$ zu $a_{2}$.    
Geschrieben: Konvertiere die *hexadezimalzahl* $A12$ in ihre binärdarstellung. (da $a_{2}$) also binär, weil basis $2$.   

**Schritt 1**: Teste ob Zahlenbasen verwandt sind   
$16 = 2^{x}, x \in \mathbb{N}$.    
Geschrieben: Gibt es ein $x$ so das $2^{x} = 16$ für $x$  in natürlichen Zahlen ?   
$\rightarrow$ Ja gibt es, $2^{4} = 16$   

**Schritt 2**: Umwandeln   
Da wir nun wissen, dass die magische Zahl $x = 4$, können wir nun ganz einfach jede Ziffer aus der Zahl $A12$ mit jeweils $4$ binär Ziffern übersetzen.    
$\rightarrow$ $A_{16} = 10_{10}$, $10_{10} = 1010_{2}$    
	$1_{16}= 1_{10} = 1_2$    
	$2_{16} = 2_{10} = 10_{2}$     

Hier sind wir schon fast fertig, allerdings müssen wir ja $4$ Stellen und jeder Ziffer haben, und $1$ und $10$ haben nicht $4$, das macht aber nichts, wir packen einfach so viele Nullen davor, bis es $4$ sind.    
$1_{2} = 0001_{2}$      
$10_{2} = 0010_{2}$       

Durch vorstehende Nullen, ändert sich nicht der Zahlenwert. 

**Schritt 3**: Die Zahl als ganzes aufschreiben 
$A12_{16} = 1010 0001 0010_{2}$
Fertig ✨




