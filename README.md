# javazoo


Pro třídu Ptaci, Savci a Obojzivelnici lze najít společného předka Zvire. Abstraktní třída Zvire bude uchovávat atribut String typ budoucího živočicha. Dále bude poskytovat metodu vypisDelku(). Bohužel na úrovni živočicha nelze říci, délka čeho se bude měřit, proto bude metoda vypisDelku () označena jako abstraktní. Třídy Savci, Ptaci a Obojzivelnici už abstraktní nebudou, protože v době implementace těchto tříd už je jasné, co se bude měřit. Proto je možné v nich naprogramovat metodu vypisDelku().  Díky polymorfizmu bude vždy použita správná metoda. U ptáků vypisujeme délku křídla, u obojživelníků délku těla, u savců délku srsti. 

Doplň tedy  třídy Ptaci, Savci a Obojživelnici do svého programu ZOOpark (=práce z prvního pololetí). Nechť tyto třídy vzniknou jako potomci třídy Zvire., kterou změň na abstraktní třídu. Do třídy Zvire doplň atribut String  typ, který bude plněn pro ptáky slovem "Ptaci", pro savce "Savci" a pro obojživelníky "Obojzivelnici". Přidej do svého ZOOParku i metodu vypisDelku(), jejíž funkčnost je popsána výše.
