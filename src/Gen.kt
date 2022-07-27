fun main() {

    /*out -- This subtype class will be assigned only to the same type or super type class*/

    val meetingMinutes: ProduceOutput<WordProcessor> = Notepad()
    val wallPoster: ProduceOutput<WordProcessor> = MSWord()
    val flashGame: ProduceOutput<WordProcessor> = Flash()
    val osDefaultDoc: ProduceOutput<WordProcessor> = GeneralProcessing()
    val youtubeSubtitle: ProduceOutput<Transcript> = SubEditPlayer()

    // Eg: out compiler error
    // val meetingRecording:ProduceOutput<DigitalContent> = GeneralProcessing() // Error
    // val poster:ProduceOutput<Notepad> = GeneralProcessing() //Error
    val twoDGame: ProduceOutput<DigitalContent> = Flash() // This works - Same Class Type
    val subTile: ProduceOutput<WordProcessor> = SubEditPlayer() // This works --  subtype assigned to supertype

    meetingMinutes.getContent().show()
    wallPoster.getContent().show()
    flashGame.getContent().show()
    osDefaultDoc.getContent().show()
    youtubeSubtitle.getContent().show()
    twoDGame.getContent().show()
    subTile.getContent().show()

    /*in -- This supertype class will be assigned only to the same type or subtype class*/

    val takeNotes: ConsumeInput<Notes> = Reporter()
    val pageMaker: ConsumeInput<FormattedNote> = ContentDesigner()
    val adFilm: ConsumeInput<DigitalContent> = GraphicDesigner()
    val generalContent: ConsumeInput<WordProcessor> = GeneralReviewer()
    val subTag: ConsumeInput<Transcript> = SubtitleWriter()

    // Eg: in compiler error
    // val takeNotes2: ConsumeInput<WordProcessor> = Reporter() // Error
    // val pageMaker2: ConsumeInput<WordProcessor> = ContentDesigner() // Error
    // val adFilm2: ConsumeInput<WordProcessor> = GraphicDesigner() // Error
    // val tagline: ConsumeInput<WordProcessor> = SubtitleWriter() // Error
    val generalContent2: ConsumeInput<WordProcessor> = GeneralReviewer() // No Error Same Type
    val subTag2: ConsumeInput<Transcript> = GeneralReviewer() // No Error -- supertype assigned to subtype

    takeNotes.consumeContent(Notes("Hello, Welcome to meeting"))
    pageMaker.consumeContent(FormattedNote("Thank you all"))
    adFilm.consumeContent(DigitalContent("BGM Rocks"))
    generalContent.consumeContent(WordProcessor("Great to review"))
    generalContent2.consumeContent(WordProcessor("GeneralContent2: Great to review"))
    subTag.consumeContent(Transcript("Display at the bottom"))
    subTag2.consumeContent(Transcript("Subtag 2: Display at the bottom"))

}

class General : ProduceOutput<WordProcessor> by GeneralProcessing(), ConsumeInput<Transcript> by GeneralReviewer() {

}
//Producer

class GeneralProcessing : ProduceOutput<WordProcessor> {
    override fun getContent(): WordProcessor {
        return WordProcessor("Content Processor General")
    }
}

class Notepad : ProduceOutput<Notes> {
    override fun getContent(): Notes {
        return Notes("Notepad Content")
    }
}

class MSWord : ProduceOutput<FormattedNote> {
    override fun getContent(): FormattedNote {
        return FormattedNote("Formatted Content")
    }
}

class Flash : ProduceOutput<DigitalContent> {
    override fun getContent(): DigitalContent {
        return DigitalContent("Graphic Content")
    }
}

class SubEditPlayer : ProduceOutput<Transcript> {
    override fun getContent(): Transcript {
        return Transcript("Subtitle Content")
    }
}

// Consumer

class GeneralReviewer : ConsumeInput<WordProcessor> {
    override fun consumeContent(data: WordProcessor) {
        println("GeneralReviewer -- Review the content")
        data.showConsumer()
    }
}

class Reporter : ConsumeInput<Notes> {
    override fun consumeContent(data: Notes) {
        println("Reporter - Taken Rough Notes")
        data.showConsumer()
    }
}

class ContentDesigner : ConsumeInput<FormattedNote> {
    override fun consumeContent(data: FormattedNote) {
        println("Designer - Formatted the content")
        data.showConsumer()
    }
}

class GraphicDesigner : ConsumeInput<DigitalContent> {
    override fun consumeContent(data: DigitalContent) {
        println("Graphic Designer -- Added Animation Effects to the content")
        data.showConsumer()
    }
}

class SubtitleWriter : ConsumeInput<Transcript> {
    override fun consumeContent(data: Transcript) {
        println("Subtitle Writer -- Updated subtitle content")
        data.showConsumer()
    }
}

interface ProduceOutput<out T> {
    fun getContent(): T
}

interface ConsumeInput<in T> {
    fun consumeContent(data: T)
}

open class WordProcessor(val content: String, val isStyle: Boolean = false, val isAnimated: Boolean = false) {
    fun show() {
        println("Type : $content | Style: $isStyle | Animation: $isAnimated")
    }

    fun showConsumer() {
        println("Input : $content | Style: $isStyle | Animation: $isAnimated")
    }
}

open class Notes(input: String) : WordProcessor(input)
class FormattedNote(input: String) : WordProcessor(input, true)
class DigitalContent(input: String) : WordProcessor(input, true, true)

class Transcript(input: String) : Notes(input)
