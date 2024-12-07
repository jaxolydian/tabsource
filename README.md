# TabSource
### Codename: Lydia

TabSource aims to make creating sheet music & tabs free and open-source. Unlike other similar programs, we focus on tabs and user interactivity.

## Coding in TabSource's Language

TabSource uses _STSON_, which is TabSource's hard-coded version of JSON. We plan to expand beyond that and give users more functionality, building a fully interactive language that will give the user an easier time when writing music.


- `<musicinfo>...</musicinfo>`: Contains musical properties about the song
- `<tabs id=#>...</tabs>`: Contains tabs
    - `id`: The instrument _(Ex: Guitar on id=1, Bass on id=2, etc...)_
      -  _All tabs must be represented on one continuous line!_
- `<lyrics>...</lyrics>`: Contains song lyrics

The full list of commands will be available on the wiki.

> If you would like to help clean up my code, please send a pull request in. 

## Future Plans

We plan to host a simple website that helps allow for users to download and archive music this way, along with creating a music sheet renderer that allows for your work to be exported as an image of sheet music.
