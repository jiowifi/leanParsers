import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String topic;
	public int id;
	public String name;
	public String privacy;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String state;
	public String type;
	public String organizer_name;
	public String location_name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String code_of_conduct;
	public String logo;
	public String description;
	public String start_time;
	public String end_time;
	public String timezone;
	public String email;
	public String schedule_published_on;

	public RootModel(ArrayList<Social_linksModel> social_links, String background_image, String topic, int id, String name, String privacy, CreatorModel creator, Call_for_papersModel call_for_papers, VersionModel version, String state, String type, String organizer_name, String location_name, CopyrightModel copyright, String organizer_description, String code_of_conduct, String logo, String description, String start_time, String end_time, String timezone, String email, String schedule_published_on) {

		this.social_links = social_links;
		this.background_image = background_image;
		this.topic = topic;
		this.id = id;
		this.name = name;
		this.privacy = privacy;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.state = state;
		this.type = type;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.timezone = timezone;
		this.email = email;
		this.schedule_published_on = schedule_published_on;

	}

}