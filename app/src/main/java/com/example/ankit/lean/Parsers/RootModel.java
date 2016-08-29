import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String organizer_description;
	public String type;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String timezone;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public String name;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String logo;
	public VersionModel _version;

	public RootModel(String end_time, String organizer_description, String type, String location_name, ArrayList<Social_linksModel> social_links, String topic, String timezone, String email, String description, Call_for_papersModel call_for_papers, int id, String state, String background_image, String code_of_conduct, String name, String start_time, String schedule_published_on, CreatorModel creator, String privacy, String organizer_name, CopyrightModel copyright, String logo, VersionModel version) {

		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.location_name = location_name;
		this.social_links = social_links;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.logo = logo;
		this._version = version;

	}

}