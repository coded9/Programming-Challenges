puts "Enter number of inputs"
total = Integer(gets.chomp)
puts "You entered #{total}"
primes = Array.new(total)
for i in 0..primes.length-1
  primes[i] = Integer(gets.chomp)
end
primenew = Array.new
for i in 0..primes.length-1
  n = primes[i]
  count = 0
  for i in 0..primes.length-1
    t= primes[i]
    if n%t== 0
        count = count+1
    end
  end
  if count == 1
      print "#{n} "
  end
end
