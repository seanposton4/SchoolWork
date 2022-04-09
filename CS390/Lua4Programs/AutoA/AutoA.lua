print("Enter the name of the file you wish to access.")
local filename = io.read();
local file = io.open(filename, "r")
Totalhour = 0
Classtaken = {} 
TotalTcredit = 0
TotalNcredit = 0
GPA = 0
Cantake = {}
local classTakenNum = 0

local function contains(mtble, str)
    local bool = false
    
    for w in str:gmatch("%w+") do 
        if(mtble[w] ~= nil) then
            bool = true
        end
        
    end

    return bool
end


for i = 1, 36, 1 do
    local data = file:read("*line")
    --This assigns the class string to the class variable
    local place = string.find(data, "|")
    local class = string.sub(data, 1, place - 1)
    
    --Assigns hours to hour variable 
    data = string.sub(data, place + 1)
    local place = string.find(data, "|")
    local hour = string.sub(data, 1, place - 1)
    
    --Assigns prereqs string to prereqs variable
    data = string.sub(data, place + 1)
    local place = string.find(data, "|")
    local prereqs = string.sub(data, 1, place - 1)
    

    --formats the prereqs into a table
    local prereqT = {}
    local bool = false
    local counter = 1

    
    
    

    --assigns the grade to the grade variable
    data = string.sub(data, place + 1)
    local place = string.find(data, "|")
    local grade = string.sub(data, 1)

    --Adds the GPA points to the GPA value

    if(grade == "A") then
        GPA = GPA + 4 * hour
        TotalTcredit = TotalTcredit + hour
        Classtaken[class] = true

    elseif(grade == "B") then 
        GPA = GPA + 3 * hour
        TotalTcredit = TotalTcredit + hour
        table.insert(Classtaken, class)
        Classtaken[class] = true

    elseif (grade == "C") then
        GPA = GPA + 2 * hour
        TotalTcredit = TotalTcredit + hour
        table.insert(Classtaken, class)
        Classtaken[class] = true

    elseif(grade == "D") then 
        GPA = GPA + 1 * hour
        TotalTcredit = TotalTcredit + hour
        table.insert(Classtaken, class)
        Classtaken[class] = true

    elseif (grade == "F") then
        TotalTcredit = TotalTcredit + hour
        table.insert(Classtaken, class)
        Classtaken[class] = true

    elseif(grade == "")then
        TotalNcredit = TotalNcredit + hour
        for w in prereqs:gmatch("%w+") do 
            bool = contains(Classtaken, w)

        end

        if(prereqs == "") then
            bool = true
        end

        if bool == true then
            table.insert(Cantake, class) 
        end


        

        




    end 
    
    

     


end

print()
print("File name:                   ", filename)
print("GPA:                         ", string.format( "%.2f", GPA / TotalTcredit))
print("Hours attempted:             ", TotalTcredit)
print("Credits remaining:           ", TotalNcredit)
print()
print()
print("Possible courses to take next")
for i = 1, 35, 1 do 
    if(Cantake[i] ~= nil) then
        print(Cantake[i])
    end
end




file:close()
