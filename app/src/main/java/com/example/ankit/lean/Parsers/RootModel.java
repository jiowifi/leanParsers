import java.util.ArrayList;

class RootModel {

	public int id;
	public VersionModel _version;
	public String code_of_conduct;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public String name;
	public String timezone;
	public String logo;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public String type;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String privacy;
	public String description;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String location_name;

	public RootModel(int id, VersionModel version, String code_of_conduct, String schedule_published_on, String end_time, String state, String name, String timezone, String logo, String organizer_description, String organizer_name, String background_image, String type, String email, String start_time, CreatorModel creator, String privacy, String description, String topic, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CopyrightModel copyright, String location_name) {

		this.id = id;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.name = name;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.type = type;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.privacy = privacy;
		this.description = description;
		this.topic = topic;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.location_name = location_name;

	}

}