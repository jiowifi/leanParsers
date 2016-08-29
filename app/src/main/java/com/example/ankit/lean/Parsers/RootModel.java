import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String logo;
	public String email;
	public String organizer_description;
	public String description;
	public String organizer_name;
	public String name;
	public String privacy;
	public CreatorModel _creator;
	public String end_time;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String type;
	public String timezone;
	public String topic;
	public String location_name;
	public String background_image;
	public String schedule_published_on;
	public String start_time;
	public Call_for_papersModel _call_for_papers;

	public RootModel(VersionModel version, String logo, String email, String organizer_description, String description, String organizer_name, String name, String privacy, CreatorModel creator, String end_time, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String type, String timezone, String topic, String location_name, String background_image, String schedule_published_on, String start_time, Call_for_papersModel call_for_papers) {

		this._version = version;
		this.logo = logo;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.privacy = privacy;
		this._creator = creator;
		this.end_time = end_time;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.timezone = timezone;
		this.topic = topic;
		this.location_name = location_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;

	}

}