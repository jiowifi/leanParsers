import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public String privacy;
	public String email;
	public String schedule_published_on;
	public String background_image;
	public String timezone;
	public String logo;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String state;
	public String description;
	public String type;
	public String location_name;
	public String start_time;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CreatorModel creator, String topic, String privacy, String email, String schedule_published_on, String background_image, String timezone, String logo, String organizer_name, CopyrightModel copyright, String end_time, VersionModel version, int id, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, String state, String description, String type, String location_name, String start_time, String organizer_description, Call_for_papersModel call_for_papers) {

		this._creator = creator;
		this.topic = topic;
		this.privacy = privacy;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this.state = state;
		this.description = description;
		this.type = type;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;

	}

}