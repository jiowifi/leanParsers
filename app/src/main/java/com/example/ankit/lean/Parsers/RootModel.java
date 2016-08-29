import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CreatorModel _creator;
	public String description;
	public String email;
	public String logo;
	public CopyrightModel _copyright;
	public int id;
	public String end_time;
	public String code_of_conduct;
	public String location_name;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String start_time;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String topic;
	public String name;

	public RootModel(VersionModel version, CreatorModel creator, String description, String email, String logo, CopyrightModel copyright, int id, String end_time, String code_of_conduct, String location_name, String privacy, String type, Call_for_papersModel call_for_papers, String state, String start_time, String schedule_published_on, String organizer_name, String timezone, String background_image, ArrayList<Social_linksModel> social_links, String organizer_description, String topic, String name) {

		this._version = version;
		this._creator = creator;
		this.description = description;
		this.email = email;
		this.logo = logo;
		this._copyright = copyright;
		this.id = id;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.name = name;

	}

}