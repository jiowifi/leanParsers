import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String end_time;
	public String topic;
	public String logo;
	public String email;
	public String name;
	public int id;
	public String organizer_description;
	public VersionModel _version;
	public String background_image;
	public String description;
	public String state;
	public String privacy;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String organizer_name, Call_for_papersModel call_for_papers, String location_name, String end_time, String topic, String logo, String email, String name, int id, String organizer_description, VersionModel version, String background_image, String description, String state, String privacy, String schedule_published_on, String code_of_conduct, String type, CreatorModel creator, String start_time, String timezone, CopyrightModel copyright, ArrayList<Social_linksModel> social_links) {

		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.end_time = end_time;
		this.topic = topic;
		this.logo = logo;
		this.email = email;
		this.name = name;
		this.id = id;
		this.organizer_description = organizer_description;
		this._version = version;
		this.background_image = background_image;
		this.description = description;
		this.state = state;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.social_links = social_links;

	}

}