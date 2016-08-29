import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String background_image;
	public String type;
	public CreatorModel _creator;
	public String privacy;
	public String code_of_conduct;
	public String timezone;
	public String description;
	public int id;
	public String start_time;
	public String organizer_name;
	public String email;
	public String location_name;
	public String state;
	public VersionModel _version;
	public String logo;
	public String schedule_published_on;
	public String organizer_description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String end_time, String name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String background_image, String type, CreatorModel creator, String privacy, String code_of_conduct, String timezone, String description, int id, String start_time, String organizer_name, String email, String location_name, String state, VersionModel version, String logo, String schedule_published_on, String organizer_description, String topic, ArrayList<Social_linksModel> social_links) {

		this.end_time = end_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.background_image = background_image;
		this.type = type;
		this._creator = creator;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this.id = id;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this.state = state;
		this._version = version;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.social_links = social_links;

	}

}