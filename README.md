# SuperVSOverride
 
```diff
-Can't use This before superclass has been constructed
```

when using `This` in a function that override another calling from constructor


- `Chien` extends `Animal` and override `parle` function
- `parle` function is called from `Animal` constructor 

> :bulb: 
> - calling function overridable in constructor allow to call some init function like a `reset` function to set some default values.
> - It allow to make some code optional class constructor by overriding it if necessary for some children class

## in 4d (main 276307)

call method [test.4dm](Project/Sources/Methods/test.4dm)

```
Error when executing the method "Chien.parle" at line number 7

Can't use This before superclass has been constructed.

Error code: -10743 (4DRT)
Can't use This before superclass has been constructed.
component: '4DRT'
task -1, name: 'Application process'

Call chain:
```
```json
[
	{
		"type": "classFunction",
		"name": "Chien.parle",
		"line": 1,
		"database": "SuperVSOverride"
	},
	{
		"type": "classFunction",
		"name": "Animal:constructor",
		"line": 3,
		"database": "SuperVSOverride"
	},
	{
		"type": "classFunction",
		"name": "Chien:constructor",
		"line": 1,
		"database": "SuperVSOverride"
	},
	{
		"type": "projectMethod",
		"name": "test",
		"line": 2,
		"database": "SuperVSOverride"
	}
]
```

- For `Chat` no override, `This` is ready in `parle` function
- For `Chien` with override, `This`in debugger give `## Error # -10743` in `parle` function

PS: same with `This.myComputedAttribute:=42` called in `Animal`  constructor  and `Function set myComputedAttribute` defined in `Chien`

## in js

see [index.js](index.js)

```bash
% node index.js 
Ida aboie.
```

no issue, and others languages that I known too (like [java](MyClass.java))
