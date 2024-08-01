def text_preview(original_text, words=30):
    word_list = original_text.split()
    preview = ' '.join(word_list[:words])
    return f'{preview}...'

print(text_preview('Could not find a version that satisfies the requirement request ', 4))