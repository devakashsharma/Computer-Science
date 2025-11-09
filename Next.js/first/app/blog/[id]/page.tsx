import React from 'react'

const BlogDetails = async ({ params } : {params: Promise<{ id: string }>}) => {
  const { id } = await params;
  return (
    <div>
      BlogDetails
      <h1>Showing the blog details of #{id}</h1>
    </div>
  )
}

export default BlogDetails
