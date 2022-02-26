Class constructor($nom)
	This:C1470.nom:=$nom
	// Super() // some language force calling super(of base obj) before playing too much with instance
	This:C1470.parle()
	
Function parle()
	ALERT:C41(This:C1470.nom+" fait du bruit.")
	