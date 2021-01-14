input=gets;
	output = input[0];
	for i in 0...input.length()
		if input[i] == '-' 
			output=output+ input[i + 1];
    end
  end
print output