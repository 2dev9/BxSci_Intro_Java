""""
EngFrDict
Descibes a program that allows for the the user to translate words from English to French using
a dictionary object
"""
engToFr = dict() # makes a new dictionary named engToFr

# add elements to engToFr
engToFr['one'] = 'une'
engToFr['two'] = 'deux'
engToFr['three'] = 'trois'
engToFr['four'] = 'quatre'
engToFr['five'] = 'cinq'
engToFr['six'] = 'six'
engToFr['seven'] = 'sept'
engToFr['eight'] = 'huit'
engToFr['nine'] = 'neuf'
engToFr['ten'] = 'dix'
engToFr['How are you?'] = 'Comment allez-vous?'
engToFr['Hello'] = 'Bonjour'
engToFr['Hi'] = 'Salut'
engToFr["How's it going"] = 'Ça va?'
engToFr['I am well'] = 'Je vais bien'
engToFr['I am good'] = 'Ça va'
engToFr['Good Bye'] = 'Au Revoir'
engToFr['See you later'] = 'A plus tard'
engToFr['See you soon'] = 'A bientôt'
engToFr['Until next time'] = 'Au prochain'
engToFr['I am not well'] = 'Je vais mal'
engToFr['Good'] = 'Bien'
engToFr['Bad'] = 'Mal'

#define the function check_if_in
# function to check if a word is a value in a dictionary
# takes a value(word) and list(dictionary) as arguments
def check_if_in(word, dictionary):
    checklist = []#new list called checklist
    for w in dictionary:#for eeach element in dicitionary
        checklist.append(dictionary[w])# add the values to checklist
    return word in checklist#return True or False 
       
#define the function translate_to_French
#translates a word from English to French
def translate_to_French():
    print "Type an English phrases like a number 1-10 or greeting that you want translate to French\n"#give directions
    word = raw_input("Start non-number phrases with capital letters and use question marks(when needed) but not other punctuation\n") #prompt the user to give a word
    while word not in engToFr:# while the word isn't in the dictionary
        word = raw_input("Phrase not in dictionary. Make sure to check spelling. Don't use slang. Reenter the phrase\n")# asks them to put in a new word
    print engToFr[word] + '\n'# print the corresponding word

#define the function translate_to_English
#translates a word from French to English
def translate_to_English():
    print "Type an French phrases like a number 1-10 or greeting that you want translate to English\n"#give directions
    word = raw_input("Start non-number phrases with capital letters and use question marks(when needed) but not other punctuation\n") #prompt the user to give a word
    while check_if_in(word,engToFr) == False:#while the input phrase is not in the dictionary
        word = raw_input("Phrase not in dictionary. Make sure to check spelling. Don't use slang. Reenter the phrase\n")#ask again for the phrase
    for w in engToFr:# traverse engToFr
        if engToFr[w] == word:# if the word is in the dictionary
            print w + '\n'# print the key i.e., the English word

#ask the user which language they want to go to
times = raw_input('How many traslations do you want/Combien de phrases traduirez-vous?\n')
for k in range(int(times)):
    whichLang = raw_input('Which language do you want to translate TO/À Quelle language voulez-vous traduire?: English or French?\n')
    while whichLang != 'English' and whichLang != 'French' and whichLang != 'e' and whichLang != 'f': #if whichLang isn't english or french
            whichLang = raw_input('Enter your answer as "English" or "e" or "French" or "f" without quotations\n')# ask the user to enter "English" or "French"
    if whichLang == 'English' or whichLang == 'e':# if the user chooses English
        translate_to_English()# translate to English
    elif whichLang == 'French' or whichLang == 'f':#if the user chooses French
        translate_to_French()#translate to French
    if k < int(times):
        print 'Your translation is above\n'# tell the user to look for the translation
