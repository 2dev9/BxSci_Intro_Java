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


       
#define the function translate_to_French
#translates a word from English to French
def translate_to_French():
    word = raw_input('Type an English phrases like a number or greeting that you want translate to French\n') #prompt the user to give a word
    while word not in engToFr:# while the word isn't in the dictionary
        word = raw_input('You must enter a valid phrase using letters and not omitting punctuation\n')# asks them to put in a new word
    print engToFr[word]# print the corresponding word

#define the function translate_to_English
#translates a word from French to English
def translate_to_English():
    word = raw_input('Type a French phrases like a number or greeting that you want translate to English\n') #prompt the user to give a word
    for w in engToFr:# traverse engToFr
        word = raw_input('You must enter a valid phrase using letters and not omitting punctuation\n')
    print word   #print the word

#ask the user which language they want to go to
whichLang = raw_input('Which language do you want to translate TO/À Quelle language voulez-vous traduire?: English or French?\n')
while whichLang != 'English' and whichLang != 'French': #if whichLang isn't english or french
        whichLang = raw_input('Enter your answer as "English" or "French" without quotations\n')# ask the user to enter "English" or "French"
if whichLang == 'English':# if the user chooses English
    translate_to_English()# translate to English
elif whichLang == 'French':#if the user chooses French
    translate_to_French()#translate to French
