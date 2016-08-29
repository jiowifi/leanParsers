import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String email;
	public String state;
	public String code_of_conduct;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String description;
	public String organizer_description;
	public String type;
	public String name;
	public String end_time;
	public String start_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public String topic;
	public String privacy;
	public String background_image;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String schedule_published_on, String email, String state, String code_of_conduct, int id, CopyrightModel copyright, String organizer_name, String timezone, Call_for_papersModel call_for_papers, String logo, String description, String organizer_description, String type, String name, String end_time, String start_time, CreatorModel creator, VersionModel version, String topic, String privacy, String background_image, String location_name, ArrayList<Social_linksModel> social_links) {

		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.type = type;
		this.name = name;
		this.end_time = end_time;
		this.start_time = start_time;
		this._creator = creator;
		this._version = version;
		this.topic = topic;
		this.privacy = privacy;
		this.background_image = background_image;
		this.location_name = location_name;
		this.social_links = social_links;

	}

}