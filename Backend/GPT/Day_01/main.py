# cmd to run: python -m uvicorn main:app --reload

from fastapi import FastAPI # type: ignore
from pydantic import BaseModel # type: ignore

app = FastAPI()

# GET route
@app.get("/")
def read_root():
    return {"message": "Welcome to FastAPI!"}

# Request body validation with Pydantic
class EchoInput(BaseModel):
    message: str
    count: int

# POST route
@app.post("/echo")
def echo_data(data: EchoInput):
    return {"you_sent": data.dict()}


'''
Q1: What happens if you send wrong data types (e.g., string instead of integer) in /echo?
- In simple terms, FastAPI will return a 422 Unprocessable Entity error, indicating that the input data is invalid. Because of Pydantic's validation, it checks the types and structure of the incoming data against the `EchoInput` model.

Q2: How does FastAPI know how to validate incoming data?
- FastAPI uses Pydantic models to define the structure and types of the data. When a request is made to the server in our case it is `/echo`, FastAPI automatically validates the incoming JSON against the `EchoInput` model, checking for required fields and correct data types.

'''