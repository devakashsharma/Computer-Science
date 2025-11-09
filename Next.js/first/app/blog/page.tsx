import Link from "next/link"

const Blog = () => {
  return (
    <div>
      Blog
      <div>
        <ul>
            <li><Link href={'blog/1'}>Blog 1</Link></li>
            <li><Link href={'blog/2'}>Blog 2</Link></li>
            <li><Link href={'blog/3'}>Blog 3</Link></li>
            <li><Link href={'blog/4'}>Blog 4</Link></li>
            <li><Link href={'blog/5'}>Blog 5</Link></li>
        </ul>
      </div>
    </div>
  )
}

export default Blog
