def run_lenght_encoding(text: str) -> str:
    result = []
    count = 1
    for i in range(1, len(text)):
        if text[i] == text[i - 1]:
            count += 1
        else:
            result.append(str(count))
            result.append(text[i - 1])
            count = 1

    result.append(str(count))
    result.append(text[-1])

    return "".join(result)