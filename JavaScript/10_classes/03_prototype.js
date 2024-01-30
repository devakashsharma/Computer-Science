// what I want is that, I want to create a method, not the property()
let myName = "Eren     "; // 9
// console.log(myName.length);
// but i want to trim + length just by using trueLength, 
// console.log(myName.trueLength);

let nStr = "busan";
let heros = ["Naruto", "Eren"]
let herosAbility = {
    Naruto: "Shinobi",
    Eren: "Titan",

    getErenPower: function () {
        console.log(`Naruto Power is ${this.Naruto}`);
    }
}

// but if i want to inject a variable
Object.prototype.myself = function() {
    console.log(`I'm present in all objects`);
}

// herosAbility.myself(); // I'm present in all objects
// heros.myself(); // I'm present in all objects
// nStr.myself(); // I'm present in all objects

Array.prototype.arraySelf = () => {
    console.log(`New Array present in all`);
}

heros.arraySelf();
heros.myself()