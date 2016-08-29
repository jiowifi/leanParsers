import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public String location_name;
	public String state;
	public String background_image;
	public String logo;
	public String topic;
	public String privacy;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String email;
	public String organizer_description;
	public String end_time;
	public String description;
	public CreatorModel _creator;

	public RootModel(Call_for_papersModel call_for_papers, String name, String start_time, String timezone, String organizer_name, VersionModel version, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, String location_name, String state, String background_image, String logo, String topic, String privacy, int id, ArrayList<Social_linksModel> social_links, String type, String email, String organizer_description, String end_time, String description, CreatorModel creator) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._version = version;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.state = state;
		this.background_image = background_image;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.email = email;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.description = description;
		this._creator = creator;

	}

}