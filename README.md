Asocjacja "zwykła"{
	W powyższym przykładzie klasa Car posiada pole typu 
	Mechanic, które przechowuje informacje o mechaniku, 
	który jest przypisany do samochodu. Klasa Mechanic 
	nie posiada natomiast żadnego pola typu Car. Dlatego 
	asocjacja pomiędzy tymi klasami jest jednostronna i 
	można ją określić jako "jeden do jeden", czyli każdy 
	samochód posiada dokładnie jednego przypisanego 
	mechanika, a każdy mechanik jest przypisany do 
	dokładnie jednego samochodu.
}

Asocjacja z atrybutem{
	W tym kodzie, klasa Car posiada prywatne pole repair 
	typu Repair, które reprezentuje informacje o naprawie 
	samochodu. Klasa Repair posiada pole typu Mechanic, 
	które przechowuje informacje o mechaniku, który dokonał 
	naprawy oraz pole cost, które przechowuje informacje o 
	koszcie naprawy.

	Asocjacja między klasami Car i Mechanic jest realizowana
	przez obiekt klasy Repair. Atrybut repair klasy Car wskazuje 
	na obiekt klasy Repair, który przechowuje informacje o 
	naprawie samochodu, w tym o koszcie i mechaniku, który dokonał 
	naprawy.

	Dzięki temu, za pomocą metody getRepairCost(), możliwe 
	jest uzyskanie informacji o koszcie naprawy danego samochodu,
	bez konieczności bezpośredniego dostępu do obiektu klasy Repair.
}

Asocjacja kwalifikowana{
	
	W tym kodzie, asocjacja kwalifikowana jest realizowana przez 
	kolekcję repairs w klasie Car. Kolekcja ta przechowuje obiekty 
	klasy Repair dla każdego mechanika, który dokonał naprawy na tym 
	samochodzie. Kluczami w kolekcji są obiekty klasy Mechanic, a 
	wartościami są obiekty klasy Repair.

	Dzięki temu, za pomocą metody addRepair(), możliwe jest dodanie 
	nowej naprawy do samochodu, przypisując ją do konkretnego mechanika. 
	A metoda getRepairCost() zwraca koszt naprawy przypisanej do danego 
	mechanika.
}

Asocjacja kompozycja{
	W tym kodzie, klasa Car posiada pole engine, które jest typu Engine.
	W konstruktorze Car tworzymy obiekt klasy Engine, co oznacza, że obiekt 
	engine jest częścią składową obiektu Car. To właśnie jest przykładem 
	asocjacji typu kompozycja.

	W klasie Engine mamy tylko pola i metody związane z silnikiem 
	samochodowym, a nie z całą klasą Car. Dzięki temu kod jest bardziej 
	modułowy i łatwiejszy w utrzymaniu.

	W klasie Car dodaliśmy metodę getEngine(), która zwraca obiekt klasy 
	Engine dla danego samochodu.
}
