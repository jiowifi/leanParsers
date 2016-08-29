import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String location_name;
	public String name;
	public String schedule_published_on;
	public String email;
	public String organizer_description;
	public String timezone;
	public String background_image;
	public String topic;
	public String type;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String logo;
	public int id;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String privacy;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;

	public RootModel(CreatorModel creator, String location_name, String name, String schedule_published_on, String email, String organizer_description, String timezone, String background_image, String topic, String type, String state, VersionModel version, ArrayList<Social_linksModel> social_links, String code_of_conduct, String logo, int id, CopyrightModel copyright, String organizer_name, String privacy, String end_time, String description, Call_for_papersModel call_for_papers, String start_time) {

		this._creator = creator;
		this.location_name = location_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.background_image = background_image;
		this.topic = topic;
		this.type = type;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.id = id;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;

	}

}