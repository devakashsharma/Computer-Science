import NewApps from "./NewApp"

function App() {

  return (
    // <h1>Learning React with Vite</h1>
    // we can only return one tag, it could be NewApps, h1, h2, p etc, but it will take only one tag, but there is a trick....... and we call it fragment
    <>
        <NewApps />
        <h2>New H2</h2>
        <p>Para, Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam animi ipsam aut debitis totam! Sint temporibus minima, animi quod dicta sequi earum. Deserunt sint laborum aut dicta maxime, modi repudiandae.</p>
    </>
  )
}

export default App
