package com.example.trabajomvvm.model

class QuoteProvider {
    companion object {
        fun random():QuoteModel{
            val position=(0..12).random()
            return quote[position]
        }
        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "La música puede cambiar el mundo porque puede cambiar a las personas.",
                author = "Bono"
            ),
            QuoteModel(
                quote = "La vida es un viaje y el amor es lo que lo hace significativo.",
                author = "Demi Lovato"
            ),
            QuoteModel(
                quote = "No tengas miedo de ser diferente. A veces, la gente puede hacer lo que sea por encajar.",
                author = "Taylor Swift"
            ),
            QuoteModel(
                quote = "La música es lo que siento en mi corazón, y no hay razón para no compartirlo.",
                author = "Selena Gomez"
            ),
            QuoteModel(
                quote = "No importa cuán lejos sientas que estás, siempre puedes volver.",
                author = "Ed Sheeran"
            ),
            QuoteModel(
                quote = "Vive la vida con pasión, y si tienes miedo, hazlo con miedo.",
                author = "Madonna"
            ),
            QuoteModel(
                quote = "La felicidad es el resultado de hacer lo que amas.",
                author = "Katy Perry"
            ),
            QuoteModel(
                quote = "A veces hay que arriesgarse a perder algo para ganar algo mejor.",
                author = "Ariana Grande"
            ),
            QuoteModel(
                quote = "No dejes que nadie te diga que no puedes hacer algo. Tienes un sueño, debes protegerlo.",
                author = "Will Smith"
            ),
            QuoteModel(
                quote = "No importa lo que digan, yo sigo siendo quien soy.",
                author = "Eladio Carrión"
            ),
            QuoteModel(
                quote = "Hay que ser realista, pero también hay que soñar.",
                author = "Bad Bunny"
            ),
            QuoteModel(quote = "La música es la forma más pura de expresión.", author = "Mora"),
            QuoteModel(quote = "No hay límites para lo que puedo alcanzar.", author = "Luar"),
        )
    }
}