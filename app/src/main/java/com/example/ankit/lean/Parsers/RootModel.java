import java.util.ArrayList;

class RootModel {

	public String start_time;
	public int id;
	public String code_of_conduct;
	public String email;
	public String state;
	public String name;
	public String privacy;
	public String location_name;
	public CreatorModel _creator;
	public String timezone;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public VersionModel _version;
	public String organizer_name;
	public String type;
	public String schedule_published_on;
	public String organizer_description;

	public RootModel(String start_time, int id, String code_of_conduct, String email, String state, String name, String privacy, String location_name, CreatorModel creator, String timezone, String background_image, String logo, Call_for_papersModel call_for_papers, CopyrightModel copyright, String description, String topic, ArrayList<Social_linksModel> social_links, String end_time, VersionModel version, String organizer_name, String type, String schedule_published_on, String organizer_description) {

		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.state = state;
		this.name = name;
		this.privacy = privacy;
		this.location_name = location_name;
		this._creator = creator;
		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.description = description;
		this.topic = topic;
		this.social_links = social_links;
		this.end_time = end_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;

	}

}