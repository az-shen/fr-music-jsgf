#JSGF V1.0 utf-8 en; 
grammar music_play;

public <music_play> =
	<request> <music>; 

<request> = 
	[can you] (put on | play [me]) | 
	I want to listen to; 

<music> = 
	<artist> | 
	<song> [by <artist>] | 
	<genre> [music] | 
	<album> [by <artist>]; 

<artist> = 
	beatles | 
	radiohead |
	cake |
	pink floyd; 

<song>   =
    	comfortably numb |
	paranoid android |
	let it be | 
	hey jude; 

<genre> =
	jazz |
	rap |
	rock; 

<album> =
	ummagumma | 
	abbey road |
	ok computer;

