# fr-music-jsgf

Simple CFG for play music intent. 

## Task 1: Extension

The English grammar is limited in only being able to produce a subset of possible syntactic structures compared to the variety that may actually be used by real life speakers, including politeness terms, utterances that are not fully formed sentences, and instances of ungrammaticality. Writing and importing a politeness grammar can account for user utterances with “please” and “thank you”. Utterances that are not complete sentences, such as “ummagumma by Pink Floyd,” can be captured by rendering <request> optional in <music_play>. Data can be collected either by eliciting speech or text from human speakers or by using relevant existing corpora, which can then be referenced to set weights for productions that occur (more or less) frequently. One potentially common structure that this grammar does not currently capture is the use of possessives in utterances such as “Play Beyonce’s album …”
  
## Task 2: Localization
  
The localized French grammar can generate utterances such as:
```
[Peux-tu me mettre du]<unk> [Beatles]<artist_fr>
[Pouvez-vous jouer]<unk> [Radiohead]<artist_fr>
[Je veux écouter de la musique]<unk> [jazz]<genre_fr>
[Joue moi]<unk> [ummagumma]<album_fr> [de]<unk> [Pink Floyd]<artist_fr> 
[Mets du]<unk> [rock]<genre_fr>
[Jouer]<unk> [Hey Jude]<song_fr> [de]<unk> [Beatles]<artist_fr>
[Mettre]<unk> [Paranoid Android]<song_fr>
 ```
