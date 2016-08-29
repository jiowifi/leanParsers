import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String schedule_published_on;
	public String timezone;
	public String privacy;
	public String description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String name;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String logo;
	public String email;
	public String organizer_description;
	public String topic;
	public String location_name;
	public String start_time;
	public String organizer_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public VersionModel _version;

	public RootModel(String end_time, String schedule_published_on, String timezone, String privacy, String description, CreatorModel creator, CopyrightModel copyright, String name, String type, String background_image, ArrayList<Social_linksModel> social_links, String state, String logo, String email, String organizer_description, String topic, String location_name, String start_time, String organizer_name, String code_of_conduct, Call_for_papersModel call_for_papers, int id, VersionModel version) {

		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.privacy = privacy;
		this.description = description;
		this._creator = creator;
		this._copyright = copyright;
		this.name = name;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;
		this.logo = logo;
		this.email = email;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this._version = version;

	}

}