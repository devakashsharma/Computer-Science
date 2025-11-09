import Hello from "@/components/hello";

const Home = () => {
  console.log("Heheh, Ore wa, in Server");

  return (
    <main>
      <div className="text-4xl font-bold">Welcome to the Akash's World</div>

      <Hello />
    </main>
  );
};

export default Home;
