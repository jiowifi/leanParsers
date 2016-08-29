import java.util.ArrayList;

class RootModel {

	public String logo;
	public String name;
	public String organizer_name;
	public String email;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public String schedule_published_on;
	public String type;
	public String background_image;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String state;
	public VersionModel _version;

	public RootModel(String logo, String name, String organizer_name, String email, int id, String code_of_conduct, CopyrightModel copyright, String organizer_description, String topic, String schedule_published_on, String type, String background_image, String privacy, Call_for_papersModel call_for_papers, String location_name, String description, CreatorModel creator, String end_time, String timezone, ArrayList<Social_linksModel> social_links, String start_time, String state, VersionModel version) {

		this.logo = logo;
		this.name = name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.background_image = background_image;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.timezone = timezone;
		this.social_links = social_links;
		this.start_time = start_time;
		this.state = state;
		this._version = version;

	}

}